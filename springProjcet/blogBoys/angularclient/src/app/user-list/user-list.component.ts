import { Component, OnInit } from '@angular/core';
import { User } from '../../users';
import { UserService } from '../service/users-service.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.userService.findAll().subscribe(data => {
      console.log("test")
      this.users = data;
    });
  }
}
