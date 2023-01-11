import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Encuesta } from '../models/encuesta';

@Injectable({
  providedIn: 'root'
})
export class EncuestaService {

  url = 'http://localhost:8080/dane/';

  constructor(
    private httpClient: HttpClient
    ) { }

  public lista(): Observable<Encuesta[]>{
    return this.httpClient.get<Encuesta[]>(this.url + 'encuesta/lista');
  }

  public save(encuesta: Encuesta): Observable<any>{
    return this.httpClient.post<any>(this.url + 'encuesta/create', encuesta); /*Si no se envía objeto poner {}*/
  }
}
