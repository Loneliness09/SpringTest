<%--
  Created by IntelliJ IDEA.
  User: Jarvis Sun
  Date: 2025/5/15
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<button onclick="getJson()">获取学生信息</button>

</body>
<script>
    class address {
        info;
        postcode
    }
    let ad = new address()
    ad.info = "abc"
    ad.postcode = "10012"
    let params = {
        id: "111",
        name: "ZhangSan",
        sex: "Male",
        address: ad
    };
    // let jsonContent = JSON.stringify(params);

    let jsonContent = params;
    async function getJson() {
        let a = await axios.post("studentParam.do", jsonContent, {
            headers: {
                'Content-Type': 'application/json',
            }
        });
        console.log(a)
        alert(a.data)
    }
</script>
</html>
