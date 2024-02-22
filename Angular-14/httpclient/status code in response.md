
```ts 
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

interface YourDataInterface {
  // Define the structure of your data
}

@Injectable({
  providedIn: 'root'
})
export class YourService {

  constructor(private http: HttpClient) { }

  fetchData(): Observable<HttpResponse<YourDataInterface>> {
    return this.http.get<YourDataInterface>('your/api/endpoint', { observe: 'response' });
  }
}

```


```ts
yourService.fetchData().subscribe(
  (response: HttpResponse<YourDataInterface>) => {
    console.log('Response status code:', response.status);
    console.log('Response body:', response.body);
  },
  (error) => {
    console.error('Error occurred:', error);
  }
);

```