import { Customer } from "./custom;
export class Purchase {
    id:number;
    dop:Date;
    productname:string;
    quantity:number;
    totalcost:number;
    transactionid:string;
    customer:Customer;
}