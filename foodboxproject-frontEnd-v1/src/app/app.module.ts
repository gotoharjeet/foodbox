
import { AppComponent } from "./app.component";
import { HeaderComponent } from "./header/header.component";
import { BrowserModule } from "@angular/platform-browser";
import { AppRoutingModule } from "./app-routing.module";
import { FormsModule } from "@angular/forms";
import { NgModule } from "@angular/core";
import { AdminLoginComponent } from "./components/admin-login/admin-login.component";
import {AdminDashboardComponent} from "./components/admin-dashboard/admin-dashboard.component";
import { HttpClientModule } from "@angular/common/http";
import { ReactiveFormsModule } from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations"
import {MatSnackBarModule} from "@angular/material/snack-bar";
import { MatSortModule } from "@angular/material/sort";
import { ProductComponent } from "./components/product/product.component";
import { CartComponent } from "./components/cart/cart.component";
import { Cart } from "./components/model/cart";


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProductComponent,
    AdminLoginComponent,
    AdminDashboardComponent,
    CartComponent

  ],
  imports: [
    
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatSnackBarModule,
    MatSortModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

