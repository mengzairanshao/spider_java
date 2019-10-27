<%--
  Created by IntelliJ IDEA.
  User: han
  Date: 2019/10/6
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>spider</title>
    <link rel="stylesheet" href="./css/spider.css">
</head>
<body>

<div class=main>
    <form class=put-in action="search" method="get" role="form">

        <div class=sub-box>
            <label class="character">搜索引擎:</label>
            <select class="form-control">
                <option value="baidu" name="which">baidu</option>
                <option value="google" name="which">google</option>
                <option value="bing" name="which">bing</option>
                <option value="yandex" name="which">yandex</option>
            </select>
        </div>

        <div class=sub-box>
            <label class="character">关键字:</label>
            <input id="password" name="arg1" class="form-control" type="text" placeholder="请输入关键词">
        </div>
        <div class=sub-box>
            <label class="character">爬取页数:</label>
            <input id="page" name="arg2" class="form-control" type="text" placeholder="请输入页数">
        </div>
        <button>提交</button>
    </form>
</div>
</body>
</html>
