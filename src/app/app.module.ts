import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { EmployeeComponent } from './employee/employee.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AmericanVendorComponent } from './american-vendor/american-vendor.component';
import { IndianVendorComponent } from './indian-vendor/indian-vendor.component';
import { MexicanVendorComponent } from './mexican-vendor/mexican-vendor.component';
import { FormsModule } from '@angular/forms';
import { OrderComponent } from './order/order.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { ProfilecardComponent } from './profilecard/profilecard.component';
import { AdminactionComponent } from './adminaction/adminaction.component';
import { EmployeetransactionComponent } from './employeetransaction/employeetransaction.component';
import { AmericanProfileComponent } from './american-profile/american-profile.component';
import { IndianprofileComponent } from './indianprofile/indianprofile.component';
import { MexicanprofileComponent } from './mexicanprofile/mexicanprofile.component';
import { AcceptComponent } from './accept/accept.component';
import { VendortransactionComponent } from './vendortransaction/vendortransaction.component';
import { HeaderService } from './header/header.service';
import { IndiantransactionComponent } from './indiantransaction/indiantransaction.component';
import { AcceptindianComponent } from './acceptindian/acceptindian.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    
    EmployeeComponent,
    HeaderComponent,
    AcceptComponent,
    FooterComponent,
    AmericanVendorComponent,
    IndianVendorComponent,
    MexicanVendorComponent,
    OrderComponent,
    LoginComponent,
    AdminhomeComponent,
    ProfilecardComponent,
    AdminactionComponent,
    EmployeetransactionComponent,
    AmericanProfileComponent,
    IndianprofileComponent,
    MexicanprofileComponent,
    VendortransactionComponent,
    IndiantransactionComponent,
    AcceptindianComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  exports: [OrderComponent],
  providers: [HeaderService],
  bootstrap: [AppComponent,OrderComponent]
})
export class AppModule { }


