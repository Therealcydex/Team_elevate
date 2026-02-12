import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  credentials = { username: '', password: '' };

  constructor(private authService: AuthService, private router: Router) {}

  onLogin() {
    this.authService.login(this.credentials).subscribe({
      next: (token) => {
        alert('Login Successful! Welcome back.');
        this.router.navigate(['/']); // Go to home
      },
      error: (err) => alert('Login Failed: ' + err.error)
    });
  }
}