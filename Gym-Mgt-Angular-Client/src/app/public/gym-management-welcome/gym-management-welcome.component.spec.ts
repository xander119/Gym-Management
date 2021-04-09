import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GymManagementWelcomeComponent } from './gym-management-welcome.component';

describe('GymManagementWelcomeComponent', () => {
  let component: GymManagementWelcomeComponent;
  let fixture: ComponentFixture<GymManagementWelcomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GymManagementWelcomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GymManagementWelcomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
