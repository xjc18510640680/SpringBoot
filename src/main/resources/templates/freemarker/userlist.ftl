<html lang="zh-CN">
<head>
    <meta charset="UTF-8"/>
    <title>${title}</title>
    <style>
        table {
            width: 50%;
            font-size: .938em;
            border-collapse: collapse;/*边框合并*/
        }
        th {
            text-align: left;
            padding: .5em .5em;
            font-weight: bold;
            background: #F5F7D0;
            color: #666;
        }

        td {
            padding: .5em .5em;
            border-bottom: solid 1px #ccc;
        }

        table,table tr th, table tr td { border:1px solid #0094ff; }/*设置边框*/
    </style>
</head>
<body>
<table>
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    <#if users?? && (users?size>0)>
        <#list users as user>
            <tr>
                <td>${user.userid}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>