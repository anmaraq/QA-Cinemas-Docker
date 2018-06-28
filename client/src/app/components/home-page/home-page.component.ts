import { Component, OnInit } from '@angular/core';
import{Router}  from '@angular/router';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

 jWick:string="http://lwlcdn.lwlies.com/wp-content/uploads/2017/11/John-Wick-2-900x0-c-default.jpg";

  constructor(private _rotuer:Router) { }

  ngOnInit() {
  }

}
