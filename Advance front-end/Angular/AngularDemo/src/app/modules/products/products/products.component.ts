import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product} from '../../../models/produc.model'

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {

  products : Product[] = [];
  categories = [];
  constructor(private productService : ProductService) { }

  ngOnInit(): void {
    this.productService.getProducts().subscribe((res: any) => {
      this.products = res
    });

    this.productService.getCategoris().subscribe((res: any) =>{
      this.categories = res
    })


    
  }

  
}
