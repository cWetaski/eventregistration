import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Component1 from '@/components/Component1'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/app',
      name: 'Component1',
      component: Component1
    }
  ]
})
