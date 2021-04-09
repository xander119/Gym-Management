import { TestBed } from '@angular/core/testing';

import { GymManagementWelcomeService } from './gym-management-welcome.service';

describe('GymManagementWelcomeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GymManagementWelcomeService = TestBed.get(GymManagementWelcomeService);
    expect(service).toBeTruthy();
  });
});
