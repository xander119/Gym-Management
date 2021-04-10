import {Routes} from "@angular/router";
import {GymManagementWelcomeComponent} from "../public/gym-management-welcome/gym-management-welcome.component";
import { StaticDataManagementComponent } from "../public/static-data-management/static-data-management.component";

export const publicRoutes: Routes = [
  {path: 'welcome', component: GymManagementWelcomeComponent},
  {path: 'staticData', component: StaticDataManagementComponent}
];
