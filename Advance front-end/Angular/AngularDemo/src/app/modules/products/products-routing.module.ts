import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { ProductCardComponent } from './product-card/product-card.component';
import { ProductAddComponent} from './product-add/product-add.component'

const routes: Routes = [
  {
    path: '',
    component: ProductsComponent
  },
  {
    path: 'card',
    component: ProductCardComponent
  },
  {
    path: 'add-product',
    component: ProductAddComponent
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
