import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminProductListComponent} from '../products/admin-product-list/admin-product-list.component';
import { AdminProductDetailComponent } from './admin-product-detail/admin-product-detail.component';
import { ProductReactiveFormComponent} from './product-reactive-form/product-reactive-form.component';
import { CommonModule } from '@angular/common';

const routes: Routes = [
  {
    path:'',
    component: AdminProductListComponent
  },
  {
    path:'detail/:id',
    component: AdminProductDetailComponent
  },
  {
    path:'add',
    component:ProductReactiveFormComponent
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
