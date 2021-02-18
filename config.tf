provider "aws" {
  access_key = "AKIAJZC7K5KG3YAH3KZQ"
  secret_key = "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"
  region     = "us-east-1"
}

resource "aws_instance" "instance1" {
  ami           = "ami-07f5c641c23596eb9"
  instance_type = "t2.micro"
}

