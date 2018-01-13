<script>
    var websocket = null;
    if ('WebSocket' in window) {
        websocket = new WebSocket("");
    } else {
        alert("该浏览器不支持WebSocket")
    }

    websocket.onopen = function (event) {
        console.log("建立连接")
    }

    websocket.onclose = function (event) {
        console.log("关闭连接")
    }

    websocket.onmessage = function (event) {
        console.log(event.data)
    }

    websocket.onerror = function (event) {
        console.log("通信错误")
    }

    websocket.onbeforeunload = function () {
        websocket.close()
    }
</script>