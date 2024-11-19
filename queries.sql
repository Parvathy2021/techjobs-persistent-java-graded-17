----Part 1
create table job(
id int primary key auto_increment,
name varchar(50),
employer varchar(200),
skills varchar(300)
);
----Part 2
select name
from employer
where location = "St. Louis City";
----Part 3
drop table Job;
----Part 4
SELECT * FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;