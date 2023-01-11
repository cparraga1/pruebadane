import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { throwError as observableThrowError } from "rxjs";
import { Usuario } from "../model/usuario";

@Injectable({
    providedIn: 'root'
})
export class CinicioService {

    private urlApi = 'http://127.0.0.1:8081/dane/';

    constructor(
        private http: HttpClient,
        private httpClient: HttpClient
    ) {
    }

    errorHandler(error: HttpErrorResponse){
        return observableThrowError(error.message);
    }

    public validarUsuario(usuario: String): Observable<any> {
        return this.httpClient.get<any>(this.urlApi + 'usuario/detail/' + usuario);
    }

    public saveUsuario(usuario: Usuario): Observable<any> {
        return this.httpClient.post<any>(this.urlApi + 'usuario/create', usuario); /*Si no se envía objeto poner {}*/
    }
}
