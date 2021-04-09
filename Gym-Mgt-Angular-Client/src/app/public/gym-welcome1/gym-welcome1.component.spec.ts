import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GymWelcome1Component } from './gym-welcome1.component';

describe('GymWelcome1Component', () => {
  let component: GymWelcome1Component;
  let fixture: ComponentFixture<GymWelcome1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GymWelcome1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GymWelcome1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
