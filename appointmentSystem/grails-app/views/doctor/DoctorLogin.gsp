<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Doctor login</title>
</head>
<body>

<g:if test="${flash.message}">

<div class ="message">${flash.message}</div>

</g:if>

<g:form action="validate">

<input type = "hidden" name="cName" value="${cName}">

<input type = "hidden" name="aName" value="${aName}">

      <table>
        <tr class="prop">
          <td class="name">
            <label for="email">User Email:</label>
          </td>
          <td class="value">
            <input type="text" id="email" name="email" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="password">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="password" name="password" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="login"/>
          </td></tr>
      </table>
    </g:form>
  </body>
</html>


<div id="content" role="main">
    <section class="row colset-2-its">
   


</body>
</html>
