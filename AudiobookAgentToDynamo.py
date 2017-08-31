import boto3, requests


def writeToDb(asin):
	audiobookstorage = boto3.resource('dynamodb', region_name = 'us-east-1', aws_access_key_id='AKIAI4GKA2HUK5WRS2EA', aws_secret_access_key='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')
	table = audiobookstorage.Table('AudiobookStorage')

	table.put_item(
		Item={
			'asin' : asin,
			'title' : get_title(asin),
		}

	)


def get_api_response(url):
	response = requests.get(url)
	return response.json()

def get_title(asin):
	url = 'https://api.audible.com/1.0/catalog/products/{}?response_groups=product_desc'.format(asin)
	json = get_api_response(url)
	return json['product']['title']


writeToDb('B002VA9Q7K')