import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8024/users'; // Your Spring Boot port

  constructor(private http: HttpClient) { }

  register(user: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/signup`, user);
  }

  login(credentials: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/signin`, credentials, { responseType: 'text' })
      .pipe(
        tap(token => {
          localStorage.setItem('token', token); // Store the "Badge" in the browser
        })
      );
  }

  logout(): void {
    localStorage.removeItem('token'); // Throw away the badge
  }

  getToken(): string | null {
    return localStorage.getItem('token');
  }
}