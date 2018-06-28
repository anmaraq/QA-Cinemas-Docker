import { Component, OnInit } from '@angular/core';
import{Router}  from '@angular/router';
import { Film } from '../../film';
// import { FILMS } from '../../mock-films';
import { Location } from '@angular/common';
import{FilmService}  from '../../service/film.service';

@Component({
  selector: 'app-film-page',
  templateUrl: './film-page.component.html',
  styleUrls: ['./film-page.component.css']
})


export class FilmPageComponent implements OnInit {
  private films:Film[];
  constructor(private _filmService:FilmService, private _router:Router) { }


ngOnInit() {
    this._filmService.getFilms().subscribe((films)=>{
      console.log(films);
      this.films=films;
    },(error)=>{
      console.log(error);
    })
}
deleteFilm(film){
  this._filmService.deleteFilm(film.id).subscribe((data)=>{
      this.films.splice(this.films.indexOf(film),1);
  },(error)=>{
    console.log(error);
  });
}

 updateFilm(film){
   this._filmService.setter(film);
   this._router.navigate(['/form']);


 }
 newFilm(){
 let film = new Film();
  this._filmService.setter(film);
   this._router.navigate(['/form']);

 }

}
