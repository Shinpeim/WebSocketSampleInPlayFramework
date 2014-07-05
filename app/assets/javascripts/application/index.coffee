$ ->
  url = "ws://" + location.hostname + ":" + location.port + "/echosocket"
  ws = new WebSocket(url);

  $("#submit").on('click', ->
    console.log("sending ... " + $("#message").val())
    ws.send($("#message").val())
  )

  ws.onmessage = (e)->
    console.log("got" + e.data)
    $("#display").text(e.data)


