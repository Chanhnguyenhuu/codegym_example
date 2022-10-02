import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularPlaylistManagementComponent } from './angular-playlist-management.component';

describe('AngularPlaylistManagementComponent', () => {
  let component: AngularPlaylistManagementComponent;
  let fixture: ComponentFixture<AngularPlaylistManagementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularPlaylistManagementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularPlaylistManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
