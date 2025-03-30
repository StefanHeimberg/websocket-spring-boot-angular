// https://vite.dev/config/server-options

var PROXY_CONF = {
  "/actuator": "http://localhost:8080",
  '/example-app/websocket-endpoint': {
    target: 'ws://localhost:8080',
    secure: false,
    ws: true
  },
};

module.exports = PROXY_CONF;
