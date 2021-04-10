import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppComponent } from "./app.component";
import { GymManagementWelcomeComponent } from "./public/gym-management-welcome/gym-management-welcome.component";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { RouterModule } from "@angular/router";
import { publicRoutes } from "./routes/public-routes";
import { MatMenuModule } from "@angular/material/menu";
import { MatIconModule } from "@angular/material/icon";
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatButtonModule } from "@angular/material/button";
import { MatDividerModule } from "@angular/material/divider";
import { MatListModule } from "@angular/material/list";
import { MatGridListModule } from "@angular/material/grid-list";
import { ProductScreenComponent } from "./public/product-screen/product-screen.component";
import { StaticDataManagementComponent } from './public/static-data-management/static-data-management.component';
import { HttpClientModule } from "@angular/common/http";
import { MatTableModule } from "@angular/material";

@NgModule({
  declarations: [
    AppComponent,
    GymManagementWelcomeComponent,
    ProductScreenComponent,
    StaticDataManagementComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    RouterModule.forRoot(publicRoutes, { enableTracing: true }),
    MatMenuModule,
    MatTableModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
    MatDividerModule,
    MatListModule,
    MatGridListModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
