import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StaticDataManagementComponent } from './static-data-management.component';

describe('StaticDataManagementComponent', () => {
  let component: StaticDataManagementComponent;
  let fixture: ComponentFixture<StaticDataManagementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StaticDataManagementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StaticDataManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
