<%--
  Created by IntelliJ IDEA.
  User: bogda
  Date: 11-09-2019
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl-PL">
<head>
  <meta charset="UTF-8">
  <title>Przelicznik tekstu</title>
</head>
<body>
<div>
  <h1>Przelicznik tekstu</h1>
  <div class="form-control">
    <textarea rows="4" cols="50" name="textarea" form="submit" placeholder="Wpisz tekst do analizy .."></textarea>
    <form method="post" action="/text" id="submit" >
        <input type="submit" value="Wyślij">
    </form>
  </div>
</div>
</body>
</html>
