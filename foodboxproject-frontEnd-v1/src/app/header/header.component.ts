import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  heading="Wahe Guru ji"
  ishidden:boolean=false;
  isdisabled:boolean=false;

}
