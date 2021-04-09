import {Routes} from "@angular/router";
import {GymManagementWelcomeComponent} from "../public/gym-management-welcome/gym-management-welcome.component";
import {GymWelcome1Component} from "../public/gym-welcome1/gym-welcome1.component";

export const publicRoutes: Routes = [
  {path: 'welcome', component: GymManagementWelcomeComponent},
  {path: 'welcome1', component: GymWelcome1Component}
];
