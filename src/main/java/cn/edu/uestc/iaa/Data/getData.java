package cn.edu.uestc.iaa.Data;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class getData {
    public String get(String arg1, String arg2) {
        StringBuilder stringBuilder=new StringBuilder();
        String exe = "python";
        String a1=System.getProperty("user.dir");
        String command = a1+"\\..\\..\\python\\spider\\spider.py";
        System.out.println(a1);
        String[] cmdArr = new String[]{exe, command, arg1, arg2};
        CS cs=new CS();
        long startTime=System.currentTimeMillis();
        try {
            cs.setProcess(Runtime.getRuntime().exec(cmdArr));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert cs.getProcess()!=null;
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStreamReader ir = new InputStreamReader(cs.getProcess().getInputStream(), StandardCharsets.UTF_8);
                        InputStreamReader ir1 = new InputStreamReader(cs.getProcess().getErrorStream(), StandardCharsets.UTF_8);
                        LineNumberReader input = new LineNumberReader(ir);
                        LineNumberReader input1 = new LineNumberReader(ir1);
                        String result;
                        String result1;
                        while ((result = input.readLine()) != null) {
                            stringBuilder.append(result);
                            System.out.println(result);
                        }
                        while ((result1 = input1.readLine()) != null) {
                            System.err.println(result1);
                        }
                        input.close();
                        input1.close();
                        ir.close();
                        ir1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
            cs.getProcess().waitFor();
            System.out.println("exitCode= " + cs.getProcess().exitValue());
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}

class CS{
    private Process process=null;

    Process getProcess() {
        return process;
    }

    void setProcess(Process process) {
        this.process = process;
    }
}