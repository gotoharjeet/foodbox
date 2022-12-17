import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  count:number=0;
  newname:String="xyz";
  heading="Shri Guru Gobind Singh Ji"
  title = 'foodboxproject-frontEnd-v1';
  isactive:boolean=true;
  apply:boolean=true;
  cvar:String="blue";
  hascolor:boolean=true;
  display:boolean=false;
  display_hiddenValue:String="WaheGuru Ji ka khalsa sri waheguru ji ki fateh";
  incr(){
    this.count++;
  }

  decr(){
    this.count--;
  }

  updateName(){
    this.newname="abc";
  }

  show()  {
    return true;
  }
}
