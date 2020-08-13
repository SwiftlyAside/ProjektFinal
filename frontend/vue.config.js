const path = require('path');

module.exports = {
  transpileDependencies: [
    'vuetify',
  ],
  outputDir: path.resolve(__dirname, '../src/main/resources/static'),
  indexPath: '../static/index.html',
  devServer: {
    port: 8081,
    proxy: 'http://localhost:8080',
  },
};
