create table if not exists a_to_z_pipeline_requests(
repository_code Integer not null,
pipeline_request_approval1 varchar(255) null,
pipeline_request_approval_message1 varchar(255) null,
pipeline_request_approval2 varchar(255) null,
pipeline_request_approval_message2 varchar(255) null,
pipeline_request_approval3 varchar(255) null,
pipeline_request_approval_message3 varchar(255) null,
build_number varchar(255) null,
consumed_artifacts varchar(255) null,
published_artifacts varchar(255) null,
entity_state varchar(255) null,
constraint a_to_z_pipeline_requests_pk primary key(repository_code));