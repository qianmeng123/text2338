<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
         <script src="static/js/jquery-3.4.1.js"></script>
         <script>
            $(function () {
                queryProvince();
              function queryProvince() {
                  $.ajax({
                      url:"querySheng",
                      data:{
                      },
                      dataType:"json",
                      success:function (resp) {
                          $.each(resp, function(index,element) {
                              $("#select1").
                              append("<option value='"+element.id+"'>"+element.name+"</option>");
                          } )
                      }
                  })
              }

                $("#select1").change(function () {
                    var num=$("#select1").val();
                    $.ajax({
                        url:"queryCity",
                        data:{
                            name:num
                        },
                        dataType:"json",
                        success:function (resp) {
                           $("#select2").empty();
                            $.each(resp, function(index,element) {
                                $("#select2").
                                append("<option>"+element.name+"</option>");
                            } )
                        }
                    })
                })


            })


         </script>
</head>
<body>

  <div>
      <select id="select1">
        <option value="0">--请选择--</option>
      </select>

      <select id="select2">
      </select>
      <br>
       <form action="show" method="post">
           账号：<input type="text">
           密码: <input type="text">
           <input type="submit">
       </form>


  </div>

</body>
</html>
