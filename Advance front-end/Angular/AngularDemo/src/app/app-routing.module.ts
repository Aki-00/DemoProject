import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent} from './components/login/login.component';
import { DefaultLayoutComponent} from './Container/default-layout/default-layout.component';
import { HomeComponent} from './components/home/home.component';


const routes: Routes = [
  {path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
    // {
    // path: 'home',
    // component: HomeComponent
    // },
    {
      path:'login',
      component: LoginComponent
    },
    // {
    //   path:'products',

    // },

    {
      path: '',
      component: DefaultLayoutComponent,
      children: [
        {
          path: 'home',
          component: HomeComponent
        },
        {
          path: 'products',
          loadChildren: () => import('./modules/products/products.module').then(m => m.ProductsModule)
        }
      ]

    }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
