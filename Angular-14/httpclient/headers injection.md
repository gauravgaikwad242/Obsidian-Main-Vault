
```ts
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class YourService {

  constructor(private http: HttpClient) { }

  fetchData(): Observable<any> {
    // Define your authorization token or header value
    const authToken = 'Bearer your_auth_token_here'; // Replace with your actual authorization token

    // Create the authorization header
    const headers = new HttpHeaders({
      'Authorization': authToken
    });

    // Make the HTTP GET request with the authorization header
    return this.http.get<any>('your/api/endpoint', { headers: headers });
  }
}

```