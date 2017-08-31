import requests

def get_api_response(url):
	response = requests.get(url)
	return response.json()

def get_title(asin):
	url = 'https://api.audible.com/1.0/catalog/products/{}?response_groups=product_desc'.format(asin)
	json = get_api_response(url)
	return json['product']['title']

#get_api_response('https://api.audible.com/1.0/catalog/products/B002VA9Q7K?response_groups=product_desc')
print get_title('B002VA9Q7K')