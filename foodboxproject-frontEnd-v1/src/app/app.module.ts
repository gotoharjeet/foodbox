import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AdminLoginComponent } from './components/admin-login/admin-login.component';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { CartComponent } from './cart/cart.component';
import { ManageCustomersComponent } from './manage-customers/manage-customers.component';
import { OrderSummaryComponent } from './components/order-summary/order-summary.component';
import { PaymentGatwayComponent } from './components/payment-gatway/payment-gatway.component';
import { ProductComponent } from './components/product/product.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AdminLoginComponent,
    AdminDashboardComponent,
    CartComponent,
    ManageCustomersComponent,
    OrderSummaryComponent,
    PaymentGatwayComponent,
    ProductComponent 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
