use std::io::stdin;

fn main() {
    let mut input: String = String::new();
    stdin().read_line(&mut input).expect("error");

    let num: i32 = input.trim().parse().expect("error");

    print!("{}", num);
}
