const path = require('path');

module.exports = {
  transpileDependencies: [
    'vuetify',
  ],
  chainWebpack: (config) => {
    config.module.rule('eslint').use('eslint-loader').options({
      fix: true,
    });
  },
  outputDir: path.resolve(__dirname, '../src/main/resources/static'),
  indexPath: '../static/index.html',
  devServer: {
    port: 8081,
    proxy: 'http://localhost:8080',
  },
};
