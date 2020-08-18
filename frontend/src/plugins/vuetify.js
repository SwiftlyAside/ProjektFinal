import Vue from 'vue';
import Vuetify from 'vuetify/lib';
import 'material-design-icons-iconfont/dist/material-design-icons.css'
import colors from 'vuetify/lib/util/colors'


Vue.use(Vuetify);

export default new Vuetify({
  theme: {
    themes: {
      light: {
        primary: colors.orange.darken1, // #E53935
        secondary: colors.orange.lighten4, // #FFCDD2
        accent: colors.orange.lighten3, // #3F51B5
      },
    },
  },
  icons: {
    iconfont: 'md', // default - only for display purposes
  },
});
