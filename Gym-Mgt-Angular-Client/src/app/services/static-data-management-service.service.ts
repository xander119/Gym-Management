import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { from, Observable } from "rxjs";
import { catchError, map } from "rxjs/operators";

@Injectable({
  providedIn: "root",
})
export class StaticDataManagementServiceService {
  constructor(private http: HttpClient) {}

  public getStaticDataList(pageSize: number, pageNum: number): Observable<any> {
    const body = { pageSize: pageSize, pageNum: pageNum };
    return this.http.post("localhost:8081/staticData/list", body).pipe(
      map((response: any) => {
        if (response) {
          console.log(response);
        }else {
          console.log('ERROR');
        }
      }),
      catchError((error: any) => {
        console.log("ERROR CAUGHT!!");
        console.error(error); // log to console instead
        return Observable.throw(error);
      })
    );
  }
}
interface StaticData {
  name: string;
  code: string;
}
