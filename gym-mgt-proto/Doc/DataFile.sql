-- STATIC_DATA
insert into static_data (code, name, type_code, active, description) VALUES ('MALE', 'Male', 'Gender', true, 'gender');
insert into static_data (code, name, type_code, active, description) VALUES ('FEMALE', 'Female', 'Gender', true, 'gender');

insert into static_data (code, name, type_code, active, description) VALUES ('ADMIN', 'Admin', 'SecurityRole', true, 'Security Role');
insert into static_data (code, name, type_code, active, description) VALUES ('MANAGER', 'Manager', 'SecurityRole', true, 'Security Role');
insert into static_data (code, name, type_code, active, description) VALUES ('TRAINER', 'Trainer', 'SecurityRole', true, 'Security Role');
insert into static_data (code, name, type_code, active, description) VALUES ('CUSTOMER', 'Customer', 'SecurityRole', true, 'Security Role');

insert into static_data (code, name, type_code, active, description) VALUES ('null1', 'null1', 'ProductType', true, 'Product Type');
insert into static_data (code, name, type_code, active, description) VALUES ('null2', 'null2', 'ProductType', true, 'Product Type');
insert into static_data (code, name, type_code, active, description) VALUES ('null3', 'null3', 'ProductType', true, 'Product Type');

insert into static_data (code, name, type_code, active, description) VALUES ('AllAccess', 'All Access', 'MembershipType', true, 'Membership Type');
insert into static_data (code, name, type_code, active, description) VALUES ('GymOnly', 'Gym Only', 'MembershipType', true, 'Membership Type');
insert into static_data (code, name, type_code, active, description) VALUES ('PoolOnly', 'Pool Only', 'MembershipType', true, 'Membership Type');
insert into static_data (code, name, type_code, active, description) VALUES ('ClassOnly', 'Class Only', 'MembershipType', true, 'Membership Type');

insert into static_data (code, name, type_code, active, description) VALUES ('瑜伽', '瑜伽', 'SkillType', true, 'Skill Type');
insert into static_data (code, name, type_code, active, description) VALUES ('普拉提', '普拉提', 'SkillType', true, 'Skill Type');
insert into static_data (code, name, type_code, active, description) VALUES ('力量训练', '力量训练', 'SkillType', true, 'Skill Type');

insert into static_data (code, name, type_code, active, description) VALUES ('例子', '例子', 'ClassType', true, 'Class Type');

-- ROLE
insert into role(name, role_type_id, active) VALUES ('Admin', (select i.static_data_id from static_data as i where code = 'ADMIN' and type_code = 'SecurityRole'), true);
insert into role(name, role_type_id, active) VALUES ('Manager', (select i.static_data_id from static_data as i where code = 'MANAGER' and type_code = 'SecurityRole'), true);
insert into role(name, role_type_id, active) VALUES ('Trainer', (select i.static_data_id from static_data as i where code = 'TRAINER' and type_code = 'SecurityRole'), true);
insert into role(name, role_type_id, active) VALUES ('Customer', (select i.static_data_id from static_data as i where code = 'CUSTOMER' and type_code = 'SecurityRole'), true);

-- PERMISSION
insert into gm_permission(name, type, value, uri) VALUES ('SuperAdmin', 'SuperAdmin', '**', '**');
insert into gm_permission(name, type, value, uri) VALUES ('ViewMembership', 'ViewMembership', 'Membership:show', 'membership/view');
insert into gm_permission(name, type, value, uri) VALUES ('UpdateMembership', 'UpdateMembership', 'Membership:update', 'membership/update');
insert into gm_permission(name, type, value, uri) VALUES ('DeleteMembership', 'DeleteMembership', 'Membership:delete', 'membership/delete');



