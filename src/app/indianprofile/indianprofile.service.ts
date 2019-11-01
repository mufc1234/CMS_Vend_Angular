import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IndianprofileService {
  constructor(private httpClient: HttpClient) { }

  getindian(): Observable<indianprofile[]> {
    let url ="http://localhost:8080/CMS/api/training/prof/vend/3402";
    return this.httpClient.get<indianprofile[]>(url);
  }
}