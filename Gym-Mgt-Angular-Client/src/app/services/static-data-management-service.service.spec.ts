import { TestBed } from '@angular/core/testing';

import { StaticDataManagementServiceService } from './static-data-management-service.service';

describe('StaticDataManagementServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StaticDataManagementServiceService = TestBed.get(StaticDataManagementServiceService);
    expect(service).toBeTruthy();
  });
});
