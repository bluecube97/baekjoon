use chrono::prelude::*;

fn main(){
    let utc: DateTime<Utc> = Utc::now();
    let local: DateTime<Local> = utc.with_timezone(&Local);
    let now_time: String = local.to_string();
    let sub_now_time = &now_time[0..10];

    println!("{}", sub_now_time);
}