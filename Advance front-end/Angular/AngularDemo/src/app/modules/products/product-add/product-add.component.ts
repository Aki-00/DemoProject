import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router} from '@angular/router';
import { FormGroup, FormBuilder, Validators} from '@angular/forms'

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.scss']
})
export class ProductAddComponent implements OnInit {

  constructor( private productService:ProductService, private fb:FormBuilder, route:Router) { }
  addProduct : FormGroup;
  ngOnInit(): void {
    this.addProduct = this.fb.group({
      name: ['', Validators.required, Validators.minLength(5)],
      price: [''],
      url:['']
    });
  }

  handleAddProduct(){
    
  }

  resetForm(){

  }
}
