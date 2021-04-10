import { AfterViewInit, Component, OnDestroy, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { StaticDataManagementServiceService } from 'src/app/services/static-data-management-service.service';

@Component({
  selector: 'app-static-data-management',
  templateUrl: './static-data-management.component.html',
  styleUrls: ['./static-data-management.component.css']
})
export class StaticDataManagementComponent implements OnInit, AfterViewInit, OnDestroy {

   observer: Subscription = null;
   private tableData: any[] = [];
   displayedColumns: string[] = ['name', 'code', 'type', 'description', 'action'];
  constructor(private staticDataService: StaticDataManagementServiceService) { }

  ngOnInit() {
    console.log('ngOnInit');

    this.tableData.push({name: 'Admin', code:'ADMIN', type: 'ADMIN', description: 'SecurityRole'});
    this.tableData.push({name: 'Manager', code:'MANAGER', type: 'MANAGER', description: 'SecurityRole'});
    this.tableData.push({name: 'Trainer', code:'TRAINER', type: 'TRAINER', description: 'SecurityRole'});
    this.tableData.push({name: 'Customer', code:'CUSTOMER', type: 'CUSTOMER', description: 'SecurityRole'});
    this.tableData.push({name: 'Male', code:'MALE', type: 'Gender', description: 'Gender'});
    this.tableData.push({name: 'Female', code:'FEMALE', type: 'Gender', description: 'Gender'});
  }

  ngAfterViewInit(){
    this.observer = this.staticDataService.getStaticDataList(10, 1).subscribe(result => {
    });
  }

  ngOnDestroy(){
    
  }



}
