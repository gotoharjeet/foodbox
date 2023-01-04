import { Component,OnInit } from "@angular/core";
import { FormBuilder,FormGroup } from "@angular/forms";
import { NgModule } from "@angular/core";
import { Router } from "@angular/router";
import { AdminService } from "src/app/service/admin.service";
import { LogService } from "src/app/service/log.service";
@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  formValue !: FormGroup;
  adminData!:any;
  error:String='';
  loginData={
    username:'',
    password:''
  }
  auth:any;

 constructor(private logService:LogService, private adminService:AdminService, private router:Router) { }

  ngOnInit(): void {
    this.logService.sendHeader(0);
  }

  loginSubmit(){
    this.error="Enter Username";
    if(this.loginData.username.trim()==''||this.loginData.username==null){
      this.error="Enter Username";
      return
    }
    if(this.loginData.password.trim()==''||this.loginData.password==null){
      this.error="Enter Password";
      return
    }

    this.adminService.adminLogin(this.loginData).subscribe(data=>{
      this.auth=data;
      if(this.auth==true){
        this.logService.sendAdmin(this.loginData.username);
        this.router.navigate(['/adminDashboard']);
      }else{
        this.error="Username or password incorrect"
      }
      this.error="Username or password incorrect"
    })

  }
}